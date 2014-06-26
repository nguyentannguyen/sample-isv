package com.appdirect.isv.backend.integration.remote.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@XmlRootElement(name = "addonInstance")
public class AddonInstanceInfo implements Serializable {
	private static final long serialVersionUID = 5370444679965938449L;

	private String id;
}
