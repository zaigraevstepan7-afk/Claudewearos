package ue;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import ze.h;
import ze.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16999c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f16998b = i10;
        this.f16999c = obj;
    }

    @Override // x8.a
    public final void R(int i10) {
        switch (this.f16998b) {
            case 0:
                break;
            default:
                i iVar = (i) this.f16999c;
                iVar.f20552d = true;
                h hVar = (h) iVar.f20553e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.A();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // x8.a
    public final void S(Typeface typeface, boolean z2) {
        switch (this.f16998b) {
            case 0:
                Chip chip = (Chip) this.f16999c;
                f fVar = chip.f3835e;
                chip.setText(fVar.f17012e1 ? fVar.f17015g0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    i iVar = (i) this.f16999c;
                    iVar.f20552d = true;
                    h hVar = (h) iVar.f20553e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.A();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void c0(int i10) {
    }
}
