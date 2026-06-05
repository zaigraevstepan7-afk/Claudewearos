package t4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public m1 f15698a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f15700c;

    public c0(View view, m mVar) {
        this.f15699b = view;
        this.f15700c = mVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 m1VarD = m1.d(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        m mVar = this.f15700c;
        if (i10 < 30) {
            d0.a(windowInsets, this.f15699b);
            if (m1VarD.equals(this.f15698a)) {
                return mVar.i(view, m1VarD).c();
            }
        }
        this.f15698a = m1VarD;
        m1 m1VarI = mVar.i(view, m1VarD);
        if (i10 >= 30) {
            return m1VarI.c();
        }
        Field field = l0.f15744a;
        b0.c(view);
        return m1VarI.c();
    }
}
