package cg;

import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class k extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        e0.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Throwable th2) {
        super(str, th2);
        e0.f(str, "Detail message must not be empty");
    }
}
