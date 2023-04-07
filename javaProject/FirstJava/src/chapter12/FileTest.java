package chapter12;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		//File 은 경로에 존재하는지 여부를 확인한다. 이 메소드는 경로의 위치만 확인하는거다.
		//안에 데이터가 있던없던 확인은 리더로 한다.
		File file1 = new File("d:\\test\\test=text2.txt");
		File dir1 = new File("d:\\tests");
		
//		System.out.println(dir1.exists());
		
		if(!dir1.exists()) {
			//폴더가 존재하지 않으면 폰더를 생성해 준다.
			//파일없을때 경로를 확인(.exists())하면서 만들어(.mkdir())가면서 파일을 생성해줄수 있다.
			dir1.mkdir(); // mkdir() 해당경로에 파일생성 
			System.out.println("d : 드라이브에 tests 폴더를 생성");
		
		}
		
		//파일의 존제여부 확인 exists() 경로는 파일이는 있으면 true 없으면 false
		if(file1.exists()) {
			System.out.println("파일이 존재합니다.");
		}else{
			System.out.println("파일이 없습니다.");
		}
		
		File dir2 = new File( "d:\\test" );
		File newFile = new File("d:\\test" , "test=text2.txt" );
		File newFile2 = new File( dir2 , "test-text2.txt" );
		
		System.out.println("파일 여부 확인 : " + newFile.isFile()); // d:\\test 해당경로에 test-text2.txt 있는지 확인
		System.out.println("파일 여부 확인 : " + dir2.isDirectory());  // d:\\test라는 경로가 있는지
		
		File[] list = dir2.listFiles();

		System.out.println("------------------------------------------");
		
		for( File a : list ) {
			 if(a.isDirectory()) {
				 System.out.print("[DIR] ");
			 }else if(a.isFile()) {
				 System.out.print("[File] ");
			 }
			 
			 System.out.println(a.getName());
		}
			
		//기존의 파일을 새로운 경로로 이동시킴
        //                                 경로      ,       파일이름
		File newPathFile = new File("d:\\test\\abc" , "test=text2.txt");
		// 파일의 이동
		newFile.renameTo(newPathFile);
		System.out.println("파일 이동 완료");
		
		
	}

}
