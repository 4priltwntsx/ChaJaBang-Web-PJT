package com.ssafy.pjt.model.dto.board;

public class BoardDTO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String writeDate;
	private int readCount;
//////////////////////////////////////////////////////////	
	public BoardDTO(int bno, String title, String writer, String content, String writeDate, int readCount) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = writeDate;
		this.readCount = readCount;
	}
	
	public BoardDTO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	public BoardDTO() {}
///////////////////////////////////////////////////////////////////////

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", writeDate=" + writeDate + ", readCount=" + readCount + "]";
	}
}