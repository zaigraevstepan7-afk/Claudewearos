package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f4050a;

    public static synchronized aw a(Context context) {
        try {
            if (f4050a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f4050a = uVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4050a;
    }
}
