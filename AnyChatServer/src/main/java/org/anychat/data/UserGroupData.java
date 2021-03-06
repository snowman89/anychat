package org.anychat.data;

import net.sf.json.JSONObject;

public class UserGroupData {
	private String userGroupId;
	private String userGroupName;

	public UserGroupData(JSONObject userGroupData) {
		if (userGroupData.containsKey("userGroupId")) {
			this.userGroupId = userGroupData.getString("userGroupId");
		}
		if (userGroupData.containsKey("userGroupName")) {
			this.userGroupName = userGroupData.getString("userGroupName");
		}
	}

	public String getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUserGroupName() {
		return userGroupName;
	}

	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
}
