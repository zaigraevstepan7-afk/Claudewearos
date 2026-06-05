package v;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f17198a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f17199b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f17200c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f17199b = dLog;
        f17200c = dLog - 1.0d;
    }
}
