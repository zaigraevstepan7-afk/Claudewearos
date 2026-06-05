package androidx.constraintlayout.helper.widget;

import a4.d;
import a4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b4.b;
import d4.s;
import d4.u;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class Flow extends u {
    public final g C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4814a = new int[32];
        this.f4820z = new HashMap();
        this.f4816c = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f165r0 = 0;
        gVar.f166s0 = 0;
        gVar.f167t0 = 0;
        gVar.f168u0 = 0;
        gVar.f169v0 = 0;
        gVar.w0 = 0;
        gVar.x0 = false;
        gVar.y0 = 0;
        gVar.z0 = 0;
        gVar.A0 = new b();
        gVar.B0 = null;
        gVar.C0 = -1;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = 0.5f;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0;
        gVar.P0 = 0;
        gVar.Q0 = 2;
        gVar.R0 = 2;
        gVar.S0 = 0;
        gVar.T0 = -1;
        gVar.U0 = 0;
        gVar.V0 = new ArrayList();
        gVar.W0 = null;
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.a1 = 0;
        this.C = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f4968b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.C.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.C;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f165r0 = dimensionPixelSize;
                    gVar2.f166s0 = dimensionPixelSize;
                    gVar2.f167t0 = dimensionPixelSize;
                    gVar2.f168u0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.C;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f167t0 = dimensionPixelSize2;
                    gVar3.f169v0 = dimensionPixelSize2;
                    gVar3.w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.C.f168u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.C.f169v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.C.f165r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.C.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.C.f166s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.C.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.C.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.C.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.C.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.C.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.C.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.C.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.C.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.C.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.C.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.C.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.C.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.C.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.C.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.C.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.C.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.C.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.C.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4817d = this.C;
        i();
    }

    @Override // d4.c
    public final void h(d dVar, boolean z2) {
        g gVar = this.C;
        int i10 = gVar.f167t0;
        if (i10 > 0 || gVar.f168u0 > 0) {
            if (z2) {
                gVar.f169v0 = gVar.f168u0;
                gVar.w0 = i10;
            } else {
                gVar.f169v0 = i10;
                gVar.w0 = gVar.f168u0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00d7 A[EDGE_INSN: B:334:0x00d7->B:60:0x00d7 BREAK  A[LOOP:1: B:54:0x00c0->B:59:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    @Override // d4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(a4.g r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(a4.g, int, int):void");
    }

    @Override // d4.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        j(this.C, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.C.K0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.C.E0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.C.L0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.C.F0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.C.Q0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.C.I0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.C.O0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.C.C0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.C.T0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.C.U0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.C;
        gVar.f165r0 = i10;
        gVar.f166s0 = i10;
        gVar.f167t0 = i10;
        gVar.f168u0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.C.f166s0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.C.f169v0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.C.w0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.C.f165r0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.C.R0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.C.J0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.C.P0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.C.D0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.C.S0 = i10;
        requestLayout();
    }
}
