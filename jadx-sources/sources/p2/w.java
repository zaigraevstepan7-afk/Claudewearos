package p2;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f12760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12761b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12762c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12763d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12764e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12765f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12766g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12767h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12768i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final float f12769k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12770l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12771m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12772n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12773o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12774p;

    /* renamed from: q, reason: collision with root package name */
    public w f12775q;

    public w(long j, long j4, long j10, boolean z2, float f10, long j11, long j12, boolean z10, boolean z11, int i10, long j13, float f11, long j14) {
        this.f12760a = j;
        this.f12761b = j4;
        this.f12762c = j10;
        this.f12763d = z2;
        this.f12764e = f10;
        this.f12765f = j11;
        this.f12766g = j12;
        this.f12767h = z10;
        this.f12768i = i10;
        this.j = j13;
        this.f12769k = f11;
        this.f12770l = j14;
        this.f12772n = 0L;
        this.f12773o = z11;
        this.f12774p = z11;
    }

    public final void a() {
        w wVar = this.f12775q;
        if (wVar == null) {
            this.f12773o = true;
            this.f12774p = true;
        } else if (wVar != null) {
            wVar.a();
        }
    }

    public final boolean b() {
        w wVar = this.f12775q;
        return wVar != null ? wVar.b() : this.f12773o || this.f12774p;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) v.j(this.f12760a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f12761b);
        sb2.append(", position=");
        sb2.append((Object) b2.b.h(this.f12762c));
        sb2.append(", pressed=");
        sb2.append(this.f12763d);
        sb2.append(", pressure=");
        sb2.append(this.f12764e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f12765f);
        sb2.append(", previousPosition=");
        sb2.append((Object) b2.b.h(this.f12766g));
        sb2.append(", previousPressed=");
        sb2.append(this.f12767h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) g0.a(this.f12768i));
        sb2.append(", historical=");
        Object obj = this.f12771m;
        if (obj == null) {
            obj = qi.s.f13520a;
        }
        sb2.append(obj);
        sb2.append(", scrollDelta=");
        sb2.append((Object) b2.b.h(this.j));
        sb2.append(", scaleFactor=");
        sb2.append(this.f12769k);
        sb2.append(", panOffset=");
        sb2.append((Object) b2.b.h(this.f12770l));
        sb2.append(')');
        return sb2.toString();
    }

    public w(long j, long j4, long j10, boolean z2, float f10, long j11, long j12, boolean z10, int i10, ArrayList arrayList, long j13, float f11, long j14, long j15) {
        this(j, j4, j10, z2, f10, j11, j12, z10, false, i10, j13, f11, j14);
        this.f12771m = arrayList;
        this.f12772n = j15;
    }
}
