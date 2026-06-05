package qc;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13365b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f13364a = i10;
        this.f13365b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f13364a) {
            case 0:
                ((AtomicInteger) this.f13365b).set(i10);
                break;
            case 1:
                ((k) this.f13365b).b();
                break;
            default:
                r0 r0Var = mc.n.D.f11577c;
                r0.r((Context) this.f13365b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }
}
