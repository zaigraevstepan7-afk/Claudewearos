package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    public List<Scope> getImpliedScopes(Object obj) {
        return Collections.EMPTY_LIST;
    }

    public int getPriority() {
        return API_PRIORITY_OTHER;
    }
}
