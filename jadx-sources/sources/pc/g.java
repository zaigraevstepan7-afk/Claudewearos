package pc;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final qc.k f12837a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12838b;

    public g(Context context, String str, String str2, String str3) {
        super(context);
        qc.k kVar = new qc.k(context);
        kVar.f13385c = str;
        this.f12837a = kVar;
        kVar.f13387e = str2;
        kVar.f13386d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12838b) {
            return false;
        }
        this.f12837a.a(motionEvent);
        return false;
    }
}
