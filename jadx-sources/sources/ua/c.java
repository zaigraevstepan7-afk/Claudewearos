package ua;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16893a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f16894b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f16895c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f16896d;

    static {
        c cVar = new c("Menu", 0);
        f16893a = cVar;
        c cVar2 = new c("AppList", 1);
        f16894b = cVar2;
        c cVar3 = new c("RainPlayground", 2);
        f16895c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f16896d = cVarArr;
        u0.c.j(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f16896d.clone();
    }
}
