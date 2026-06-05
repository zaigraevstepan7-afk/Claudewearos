package w2;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18293a;

    /* renamed from: b, reason: collision with root package name */
    public ClipboardManager f18294b;

    public i(Context context) {
        this.f18293a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.f18294b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f18293a.getSystemService("clipboard");
        fj.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f18294b = clipboardManager2;
        return clipboardManager2;
    }
}
