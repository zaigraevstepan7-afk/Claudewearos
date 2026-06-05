package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface l {
    void b(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback d(Class cls, String str);

    Activity f();

    void startActivityForResult(Intent intent, int i10);
}
