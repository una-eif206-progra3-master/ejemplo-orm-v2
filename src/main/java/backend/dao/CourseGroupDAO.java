package backend.dao;

import backend.model.Course;
import backend.model.CourseGroup;

public interface CourseGroupDAO {
    public CourseGroup findById (int id);
    public CourseGroup save(CourseGroup courseGroup);
    public CourseGroup update(CourseGroup courseGroup);
    public void delete(CourseGroup courseGroup);
}
