package com.docapp.shared_docapp.dao_related;

import java.util.HashMap;

public interface IEntity {
    HashMap<String , ?> toHashMap();
    HashMap<String , ?> toHashMap(String ... fields);
}
