package a5;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        l.f(str, "type");
        this.f183a = str;
    }

    public String a() {
        return this.f183a;
    }
}
