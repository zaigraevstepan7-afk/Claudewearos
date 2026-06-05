package t4;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends ri.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15798e;

    public z(int i10, Class cls, int i11, int i12, int i13) {
        this.f15798e = i13;
        this.f14535a = i10;
        this.f14538d = cls;
        this.f14537c = i11;
        this.f14536b = i12;
    }

    @Override // ri.f
    public final Object c(View view) {
        switch (this.f15798e) {
            case 0:
                return g0.a(view);
            default:
                return Boolean.valueOf(g0.b(view));
        }
    }

    @Override // ri.f
    public final void d(View view, Object obj) {
        switch (this.f15798e) {
            case 0:
                g0.e(view, (CharSequence) obj);
                break;
            default:
                g0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // ri.f
    public final boolean g(Object obj, Object obj2) {
        switch (this.f15798e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
