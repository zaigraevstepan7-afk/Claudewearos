package ff;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6732b;

    /* renamed from: c, reason: collision with root package name */
    public final SideSheetBehavior f6733c;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f6732b = i10;
        this.f6733c = sideSheetBehavior;
    }

    @Override // x8.a
    public final int A() {
        switch (this.f6732b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f6733c;
                return Math.max(0, sideSheetBehavior.f3933n + sideSheetBehavior.f3934o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f6733c;
                return Math.max(0, (sideSheetBehavior2.f3932m - sideSheetBehavior2.f3931l) - sideSheetBehavior2.f3934o);
        }
    }

    @Override // x8.a
    public final int B() {
        switch (this.f6732b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f6733c;
                return (-sideSheetBehavior.f3931l) - sideSheetBehavior.f3934o;
            default:
                return this.f6733c.f3932m;
        }
    }

    @Override // x8.a
    public final int D() {
        switch (this.f6732b) {
            case 0:
                return this.f6733c.f3934o;
            default:
                return this.f6733c.f3932m;
        }
    }

    @Override // x8.a
    public final int E() {
        switch (this.f6732b) {
            case 0:
                return -this.f6733c.f3931l;
            default:
                return A();
        }
    }

    @Override // x8.a
    public final int F(View view) {
        switch (this.f6732b) {
            case 0:
                return view.getRight() + this.f6733c.f3934o;
            default:
                return view.getLeft() - this.f6733c.f3934o;
        }
    }

    @Override // x8.a
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.f6732b) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // x8.a
    public final int I() {
        switch (this.f6732b) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // x8.a
    public final boolean L(float f10) {
        switch (this.f6732b) {
            case 0:
                if (f10 > 0.0f) {
                }
                break;
            default:
                if (f10 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // x8.a
    public final boolean M(View view) {
        switch (this.f6732b) {
            case 0:
                if (view.getRight() < (A() - B()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (A() + this.f6733c.f3932m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // x8.a
    public final boolean N(float f10, float f11) {
        switch (this.f6732b) {
            case 0:
                if (Math.abs(f10) <= Math.abs(f11) || Math.abs(f10) <= 500) {
                }
                break;
            default:
                if (Math.abs(f10) <= Math.abs(f11) || Math.abs(f10) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // x8.a
    public final boolean W(View view, float f10) {
        switch (this.f6732b) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f6733c;
                float fAbs = Math.abs((f10 * sideSheetBehavior.f3930k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f6733c;
                float fAbs2 = Math.abs((f10 * sideSheetBehavior2.f3930k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // x8.a
    public final void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        switch (this.f6732b) {
            case 0:
                if (i10 <= this.f6733c.f3932m) {
                    marginLayoutParams.leftMargin = i11;
                    break;
                }
                break;
            default:
                int i12 = this.f6733c.f3932m;
                if (i10 <= i12) {
                    marginLayoutParams.rightMargin = i12 - i10;
                    break;
                }
                break;
        }
    }

    @Override // x8.a
    public final int l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f6732b) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // x8.a
    public final float m(int i10) {
        switch (this.f6732b) {
            case 0:
                float fB = B();
                return (i10 - fB) / (A() - fB);
            default:
                float f10 = this.f6733c.f3932m;
                return (f10 - i10) / (f10 - A());
        }
    }
}
