package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return z.a(context).a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return ax.a(context).a();
    }
}
