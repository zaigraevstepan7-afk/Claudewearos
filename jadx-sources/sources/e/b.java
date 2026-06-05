package e;

import c.b0;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final s f5216a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f5217b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(s sVar, b0 b0Var) {
        this.f5216a = sVar;
        this.f5217b = b0Var;
        if ((sVar == null ? b0Var : sVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }
}
