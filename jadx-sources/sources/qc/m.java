package qc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13405d;

    public m(Context context, String str, boolean z2, boolean z10) {
        this.f13402a = context;
        this.f13403b = str;
        this.f13404c = z2;
        this.f13405d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0 r0Var = mc.n.D.f11577c;
        Context context = this.f13402a;
        AlertDialog.Builder builderJ = r0.j(context);
        builderJ.setMessage(this.f13403b);
        if (this.f13404c) {
            builderJ.setTitle("Error");
        } else {
            builderJ.setTitle("Info");
        }
        if (this.f13405d) {
            builderJ.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderJ.setPositiveButton("Learn More", new h(context, 2));
            builderJ.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderJ.create().show();
    }
}
