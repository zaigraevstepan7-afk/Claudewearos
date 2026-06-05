package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final kf.r f4115a;

    /* renamed from: b, reason: collision with root package name */
    private final kf.r f4116b;

    /* renamed from: c, reason: collision with root package name */
    private final kf.r f4117c;

    /* renamed from: d, reason: collision with root package name */
    private final kf.r f4118d;

    /* renamed from: e, reason: collision with root package name */
    private final kf.r f4119e;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        h.a aVar = new h.a(context);
        this.f4115a = aVar;
        kf.o oVarB = kf.o.b(ac.f4006a);
        this.f4116b = oVarB;
        au auVar = new au(aVar, l.f4108a);
        this.f4117c = auVar;
        kf.o oVarB2 = kf.o.b(new al(aVar, oVarB, auVar, l.f4108a));
        this.f4118d = oVarB2;
        this.f4119e = kf.o.b(new ab(oVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f4119e.a();
    }
}
