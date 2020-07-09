package edu.cnm.deepdive.quotes.view;

import java.net.URI;
import java.util.Date;
import org.springframework.lang.NonNull;

public interface FlatTag {

  Long getId();

  Date getCreated();

  Date getUpdated();

  @NonNull
  String getName();

  URI getHref();
}
