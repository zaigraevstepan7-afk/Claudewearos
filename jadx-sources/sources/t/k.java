package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f15210a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.j1 f15211b;

    /* renamed from: c, reason: collision with root package name */
    public p f15212c;

    /* renamed from: d, reason: collision with root package name */
    public long f15213d;

    /* renamed from: e, reason: collision with root package name */
    public long f15214e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15215f;

    public /* synthetic */ k(p1 p1Var, Object obj, p pVar, int i10) {
        this(p1Var, obj, (i10 & 4) != 0 ? null : pVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.f15210a.f15250b.invoke(this.f15212c);
    }

    @Override // f1.q2
    public final Object getValue() {
        return this.f15211b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f15211b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f15215f + ", lastFrameTimeNanos=" + this.f15213d + ", finishedTimeNanos=" + this.f15214e + ')';
    }

    public k(p1 p1Var, Object obj, p pVar, long j, long j4, boolean z2) {
        p pVarJ;
        this.f15210a = p1Var;
        this.f15211b = f1.s.A(obj);
        if (pVar != null) {
            pVarJ = d.j(pVar);
        } else {
            pVarJ = (p) p1Var.f15249a.invoke(obj);
            pVarJ.d();
        }
        this.f15212c = pVarJ;
        this.f15213d = j;
        this.f15214e = j4;
        this.f15215f = z2;
    }
}
