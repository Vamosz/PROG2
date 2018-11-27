// g++ bejaro.cpp -o bejaro -lboost_system -lboost_filesystem -lboost_program_options -std=c++14
//./bejaro

#include <iostream>
#include <string>
#include <fstream>
#include <iomanip>
#include <vector>

#include <boost/filesystem.hpp>



using namespace std;

int szamlalo=0;

void read_file (boost::filesystem::path path, vector<string> acts)
{
if(is_regular_file(path)){
	string ext(".java");
	if(!ext.compare(boost::filesystem::extension (path))) {
		string actjavaspath=path.string();
		size_t end = actjavaspath.find_last_of("/");
		string act = actjavaspath.substr(0,end);
		
		acts.push_back(act);
		szamlalo++;
		}
}else if(is_directory(path))
	for(
	boost::filesystem::directory_entry & entry :
	boost::filesystem::directory_iterator (path))
	read_file(entry.path(),acts);
	}

int main( int argc, char *argv[])
{
	system("unzip src.zip -d .");	
	string path="src";
	vector<string> acts;
	read_file(path, acts);
	cout << "Az src.zip-ben található java osztályok száma:\n" << "\t" << szamlalo << "\n";
	system("rm -r src");

}
