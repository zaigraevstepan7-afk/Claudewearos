package z5;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends u0.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20379g;

    public /* synthetic */ b(int i10) {
        this.f20379g = i10;
    }

    @Override // u0.b
    public final int g(View view, int i10, int i11) {
        switch (this.f20379g) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return i10 >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // u0.b
    public h h() {
        switch (this.f20379g) {
            case 4:
                return new d();
            default:
                return super.h();
        }
    }

    @Override // u0.b
    public final String j() {
        switch (this.f20379g) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // u0.b
    public final int k(View view, int i10) {
        switch (this.f20379g) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return i10 >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override // u0.b
    public int m(int i10, int i11) {
        switch (this.f20379g) {
            case 5:
                return i11;
            default:
                return i10;
        }
    }
}
