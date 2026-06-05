package v4;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo, boolean z2) {
        editorInfo.setStylusHandwritingEnabled(z2);
    }
}
