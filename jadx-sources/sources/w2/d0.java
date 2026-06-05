package w2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f18225a = new d0();

    public final void a(View view, p2.t tVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = tVar instanceof p2.a ? PointerIcon.getSystemIcon(context, ((p2.a) tVar).f12667b) : PointerIcon.getSystemIcon(context, zzbch.zzq.zzf);
        if (fj.l.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
