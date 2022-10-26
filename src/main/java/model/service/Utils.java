package model.service;

import bean.User;

public final class Utils {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User user) {
        if (User.NULL_USER != user && !Utils.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}