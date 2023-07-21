package com.one.day1;

import java.util.Objects;

public class SampleHashMapEmployee {
		private String name;
		private int id;
		private int age;
		private String role;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public SampleHashMapEmployee(String name, int id, int age, String role) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
			this.role = role;
		}
		@Override
		public String toString() {
			return "SampleHashMapEmployee [name=" + name + ", id=" + id + ", age=" + age + ", role=" + role + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SampleHashMapEmployee other = (SampleHashMapEmployee) obj;
			return Objects.equals(id, other.id);
		}
 		
		
}
