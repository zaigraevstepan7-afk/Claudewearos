package w2;

import android.content.ClipData;
import android.os.Build;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f18287a;

    public h(i iVar) {
        this.f18287a = iVar;
    }

    public final void a(v0 v0Var) {
        i iVar = this.f18287a;
        if (v0Var != null) {
            iVar.a().setPrimaryClip(v0Var.f18441a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            iVar.a().clearPrimaryClip();
        } else {
            iVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
