package pc;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f12863a;

    /* renamed from: b, reason: collision with root package name */
    public final i f12864b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r7, pc.n r8, pc.i r9) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.o.<init>(android.content.Context, pc.n, pc.i):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f12864b;
        if (iVar != null) {
            iVar.O = 2;
            iVar.f12841a.finish();
        }
    }
}
