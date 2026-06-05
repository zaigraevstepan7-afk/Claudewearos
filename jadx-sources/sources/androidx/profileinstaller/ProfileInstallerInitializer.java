package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import ef.f;
import j7.b;
import java.util.Collections;
import java.util.List;
import r6.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // j7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // j7.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new e(this, context.getApplicationContext()));
        return new f();
    }
}
