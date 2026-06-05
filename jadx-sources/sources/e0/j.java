package e0;

import f0.g0;
import f0.i0;
import f0.y;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f5243b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f5244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f5246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f5247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5249h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5250i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, g0 g0Var, int i10, v vVar, int i11, int i12, long j) {
        super(0);
        this.f5246e = g0Var;
        this.f5247f = vVar;
        this.f5248g = i11;
        this.f5249h = i12;
        this.f5250i = j;
        this.f5243b = hVar;
        this.f5244c = g0Var;
        this.f5245d = i10;
    }

    public final m t(int i10, int i11, int i12, long j, int i13) {
        int i14;
        h hVar = this.f5243b;
        Object objB = hVar.b(i10);
        Object objJ = hVar.f5240b.j(i10);
        List listI = i(this.f5244c, i10, j);
        if (s3.a.f(j)) {
            i14 = s3.a.j(j);
        } else {
            if (!s3.a.e(j)) {
                a0.a.a("does not have fixed height");
            }
            i14 = s3.a.i(j);
        }
        int i15 = i14;
        s3.m layoutDirection = this.f5246e.f6142b.getLayoutDirection();
        y yVar = this.f5247f.f5338m;
        return new m(i10, objB, i15, i13, layoutDirection, this.f5248g, this.f5249h, listI, this.f5250i, objJ, yVar, j, i11, i12);
    }
}
