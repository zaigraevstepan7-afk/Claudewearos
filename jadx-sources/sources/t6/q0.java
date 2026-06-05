package t6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15996a;

    /* renamed from: b, reason: collision with root package name */
    public int f15997b;

    /* renamed from: c, reason: collision with root package name */
    public int f15998c;

    /* renamed from: d, reason: collision with root package name */
    public int f15999d;

    /* renamed from: e, reason: collision with root package name */
    public int f16000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16001f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16002g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16003h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16004i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16005k;

    /* renamed from: l, reason: collision with root package name */
    public int f16006l;

    /* renamed from: m, reason: collision with root package name */
    public long f16007m;

    /* renamed from: n, reason: collision with root package name */
    public int f16008n;

    public final void a(int i10) {
        if ((this.f15999d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f15999d));
    }

    public final int b() {
        return this.f16002g ? this.f15997b - this.f15998c : this.f16000e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f15996a + ", mData=null, mItemCount=" + this.f16000e + ", mIsMeasuring=" + this.f16004i + ", mPreviousLayoutItemCount=" + this.f15997b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f15998c + ", mStructureChanged=" + this.f16001f + ", mInPreLayout=" + this.f16002g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f16005k + '}';
    }
}
