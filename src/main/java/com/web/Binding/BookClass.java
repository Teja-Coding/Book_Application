package com.web.Binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookClass {
	
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
}
