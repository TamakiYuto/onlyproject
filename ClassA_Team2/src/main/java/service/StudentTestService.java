package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserProfile;

@Service
public class StudentTestService {
	@Autowired
	private StudentProfileRepository studentProfileRepository;
	
	public StudentProfile createStudentProfile(StudentProfile studentProfile) {
		return StudentProfileRepository.save(studentProfile);
	}
	
	 public List<StudentProfile> getList(){
			
			List<St:udentiProfile> profile = studentProfileRepository.findAll();
		
			return profile;
		}
}

