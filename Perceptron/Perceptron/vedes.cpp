#include <iostream>
#include <time.h>
#include "mlp.hpp"
#include "png.hpp"

int main(int argc, char** argv){

	srand(time(NULL));

	png::image <png::rgb_pixel> png_image (argv[1]);

	int size = png_image.get_width()*png_image.get_height();

	Perceptron* p = new Perceptron(3, size, 256, 1);

	double* imager = new double[size];
	double* imageg = new double[size];
	double* imageb = new double[size];

	for(int i = 0; i<png_image.get_width();i++){
	for(int j = 0; j<png_image.get_height();j++){
		imager[ i * png_image.get_width() + j ] = png_image[i][j].red;
		imageg[ i * png_image.get_width() + j ] = png_image[i][j].green;
		imageb[ i * png_image.get_width() + j ] = png_image[i][j].blue;
		}
	}
	png::image< png::rgb_pixel > image(png_image.get_height(), png_image.get_width());

	for (png::uint_32 y = 0; y < image.get_height(); ++y){
		for (png::uint_32 x = 0; x < image.get_width(); ++x){
			image[y][x] = png::rgb_pixel( imager[ y * image.get_width() + x ],
			imageg[ y * image.get_width() + x ], imageb[ y * image.get_width() + x ]);
		}
	}
	image.write("rgb.png");

 	double value = (*p) (imager);
	std::cout << value << std::endl;

	png::image <png::rgb_pixel> png_res ( (*p)(png_image) );
	png_res.write("kimenet.png");

	delete p;
	delete imager;
	delete imageg;
	delete imageb;
	return 0;
}
