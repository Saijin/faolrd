package org.faolrd.results.google;

import org.faolrd.results.Result;

public class GoogleResult extends Result {
	public GoogleResult() {}

	public GoogleResult(String title, String url) {
		super(title, url);
	}

	public GoogleResult(String title, String url, String content) {
		super(title, url, content);
	}
}