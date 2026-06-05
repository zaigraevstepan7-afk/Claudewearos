package t6;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public r5.g f15987a;

    /* renamed from: b, reason: collision with root package name */
    public int f15988b;

    /* renamed from: c, reason: collision with root package name */
    public int f15989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15990d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15991e;

    public p() {
        d();
    }

    public final void a() {
        this.f15989c = this.f15990d ? this.f15987a.i() : this.f15987a.m();
    }

    public final void b(View view, int i10) {
        if (this.f15990d) {
            int iD = this.f15987a.d(view);
            r5.g gVar = this.f15987a;
            this.f15989c = (Integer.MIN_VALUE == gVar.f13730a ? 0 : gVar.n() - gVar.f13730a) + iD;
        } else {
            this.f15989c = this.f15987a.g(view);
        }
        this.f15988b = i10;
    }

    public final void c(View view, int i10) {
        r5.g gVar = this.f15987a;
        int iN = Integer.MIN_VALUE == gVar.f13730a ? 0 : gVar.n() - gVar.f13730a;
        if (iN >= 0) {
            b(view, i10);
            return;
        }
        this.f15988b = i10;
        if (!this.f15990d) {
            int iG = this.f15987a.g(view);
            int iM = iG - this.f15987a.m();
            this.f15989c = iG;
            if (iM > 0) {
                int i11 = (this.f15987a.i() - Math.min(0, (this.f15987a.i() - iN) - this.f15987a.d(view))) - (this.f15987a.e(view) + iG);
                if (i11 < 0) {
                    this.f15989c -= Math.min(iM, -i11);
                    return;
                }
                return;
            }
            return;
        }
        int i12 = (this.f15987a.i() - iN) - this.f15987a.d(view);
        this.f15989c = this.f15987a.i() - i12;
        if (i12 > 0) {
            int iE = this.f15989c - this.f15987a.e(view);
            int iM2 = this.f15987a.m();
            int iMin = iE - (Math.min(this.f15987a.g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.f15989c = Math.min(i12, -iMin) + this.f15989c;
            }
        }
    }

    public final void d() {
        this.f15988b = -1;
        this.f15989c = Integer.MIN_VALUE;
        this.f15990d = false;
        this.f15991e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f15988b + ", mCoordinate=" + this.f15989c + ", mLayoutFromEnd=" + this.f15990d + ", mValid=" + this.f15991e + '}';
    }
}
