package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1810b;

    public /* synthetic */ d(m mVar, int i10) {
        this.f1809a = i10;
        this.f1810b = mVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f1809a) {
            case 0:
                this.f1810b.reportFullyDrawn();
                return pi.o.f13011a;
            case 1:
                m mVar = this.f1810b;
                return new v(mVar.f1845f, new d(mVar, 0));
            case 2:
                j6.a aVar = new j6.a();
                this.f1810b.a().f1803b.b(aVar);
                return aVar;
            case 3:
                m mVar2 = this.f1810b;
                return new u0(mVar2.getApplication(), mVar2, mVar2.getIntent() != null ? mVar2.getIntent().getExtras() : null);
            default:
                m mVar3 = this.f1810b;
                b0 b0Var = new b0(new c(mVar3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (fj.l.b(Looper.myLooper(), Looper.getMainLooper())) {
                        mVar3.f1840a.a(new e(b0Var, mVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new ac.e(1, mVar3, b0Var));
                    }
                }
                return b0Var;
        }
    }
}
