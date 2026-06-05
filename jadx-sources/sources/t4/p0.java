package t4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f15764a;

    /* renamed from: b, reason: collision with root package name */
    public m1 f15765b;

    public p0(View view, androidx.datastore.preferences.protobuf.j jVar) {
        m1 m1VarB;
        this.f15764a = jVar;
        Field field = l0.f15744a;
        m1 m1VarA = e0.a(view);
        if (m1VarA != null) {
            int i10 = Build.VERSION.SDK_INT;
            m1VarB = (i10 >= 34 ? new a1(m1VarA) : i10 >= 31 ? new z0(m1VarA) : i10 >= 30 ? new y0(m1VarA) : i10 >= 29 ? new x0(m1VarA) : new w0(m1VarA)).b();
        } else {
            m1VarB = null;
        }
        this.f15765b = m1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z2;
        if (!view.isLaidOut()) {
            this.f15765b = m1.d(view, windowInsets);
            return q0.j(view, windowInsets);
        }
        m1 m1VarD = m1.d(view, windowInsets);
        j1 j1Var = m1VarD.f15751a;
        if (this.f15765b == null) {
            Field field = l0.f15744a;
            this.f15765b = e0.a(view);
        }
        if (this.f15765b == null) {
            this.f15765b = m1VarD;
            return q0.j(view, windowInsets);
        }
        androidx.datastore.preferences.protobuf.j jVarK = q0.k(view);
        if (jVarK != null && Objects.equals((m1) jVarK.f949b, m1VarD)) {
            return q0.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m1 m1Var = this.f15765b;
        int i10 = 1;
        while (i10 <= 512) {
            l4.b bVarG = j1Var.g(i10);
            l4.b bVarG2 = m1Var.f15751a.g(i10);
            int i11 = bVarG.f9967a;
            int i12 = bVarG.f9970d;
            int i13 = bVarG.f9969c;
            int i14 = bVarG.f9968b;
            int i15 = bVarG2.f9967a;
            int i16 = bVarG2.f9970d;
            int i17 = bVarG2.f9969c;
            int i18 = bVarG2.f9968b;
            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                iArr = iArr2;
                z2 = true;
            } else {
                iArr = iArr2;
                z2 = false;
            }
            if (z2 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z2) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr3[0] = iArr3[0] | i10;
                }
            }
            i10 <<= 1;
            iArr2 = iArr;
        }
        int i19 = iArr2[0];
        int i20 = iArr3[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f15765b = m1VarD;
            return q0.j(view, windowInsets);
        }
        m1 m1Var2 = this.f15765b;
        v0 v0Var = new v0(i21, (i19 & 8) != 0 ? q0.f15766e : (i20 & 8) != 0 ? q0.f15767f : (i19 & 519) != 0 ? q0.f15768g : (i20 & 519) != 0 ? q0.f15769h : null, (i21 & 8) != 0 ? 160L : 250L);
        v0Var.f15784a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f15784a.b());
        l4.b bVarG3 = j1Var.g(i21);
        l4.b bVarG4 = m1Var2.f15751a.g(i21);
        int iMin = Math.min(bVarG3.f9967a, bVarG4.f9967a);
        int i22 = bVarG3.f9968b;
        int i23 = bVarG4.f9968b;
        int iMin2 = Math.min(i22, i23);
        int i24 = bVarG3.f9969c;
        int i25 = bVarG4.f9969c;
        int iMin3 = Math.min(i24, i25);
        int i26 = bVarG3.f9970d;
        int i27 = bVarG4.f9970d;
        q5.b bVar = new q5.b(7, l4.b.c(iMin, iMin2, iMin3, Math.min(i26, i27)), l4.b.c(Math.max(bVarG3.f9967a, bVarG4.f9967a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
        q0.g(view, v0Var, m1VarD, false);
        duration.addUpdateListener(new o0(v0Var, m1VarD, m1Var2, i21, view));
        duration.addListener(new l7.i(view, v0Var));
        o.a(view, new ad.f(view, v0Var, bVar, duration, 7));
        this.f15765b = m1VarD;
        return q0.j(view, windowInsets);
    }
}
