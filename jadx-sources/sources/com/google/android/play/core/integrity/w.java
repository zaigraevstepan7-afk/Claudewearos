package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final kf.r f4121a;

    /* renamed from: b, reason: collision with root package name */
    private final kf.r f4122b;

    /* renamed from: c, reason: collision with root package name */
    private final kf.r f4123c;

    /* renamed from: d, reason: collision with root package name */
    private final kf.r f4124d;

    /* renamed from: e, reason: collision with root package name */
    private final kf.r f4125e;

    /* renamed from: f, reason: collision with root package name */
    private final kf.r f4126f;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        h.a aVar = new h.a(context);
        this.f4121a = aVar;
        kf.o oVarB = kf.o.b(bb.f4059a);
        this.f4122b = oVarB;
        au auVar = new au(aVar, n.f4113a);
        this.f4123c = auVar;
        kf.o oVarB2 = kf.o.b(new bp(aVar, oVarB, auVar, n.f4113a));
        this.f4124d = oVarB2;
        kf.o oVarB3 = kf.o.b(new bu(oVarB2));
        this.f4125e = oVarB3;
        this.f4126f = kf.o.b(new ba(oVarB2, oVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f4126f.a();
    }
}
