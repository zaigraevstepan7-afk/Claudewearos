package ef;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f5998c;

    public h(int i10) {
        this.f5998c = i10;
    }

    @Override // a.a
    public final float F(x xVar) {
        float[] fArr = ((i) xVar).U;
        if (fArr != null) {
            return fArr[this.f5998c];
        }
        return 0.0f;
    }

    @Override // a.a
    public final void X(x xVar, float f10) {
        i iVar = (i) xVar;
        float[] fArr = iVar.U;
        if (fArr != null) {
            int i10 = this.f5998c;
            if (fArr[i10] != f10) {
                fArr[i10] = f10;
                ac.h hVar = iVar.W;
                if (hVar != null) {
                    float fH = iVar.h();
                    MaterialButton materialButton = (MaterialButton) hVar.f388b;
                    int i11 = (int) (fH * 0.11f);
                    if (materialButton.Q != i11) {
                        materialButton.Q = i11;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }
}
