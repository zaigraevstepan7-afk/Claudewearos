package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f4132a;

    public static synchronized s a(Context context) {
        try {
            if (f4132a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f4132a = qVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4132a;
    }
}
