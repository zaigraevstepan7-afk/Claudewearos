package w2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f18453a = new x1();

    public final boolean a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040;
    }
}
