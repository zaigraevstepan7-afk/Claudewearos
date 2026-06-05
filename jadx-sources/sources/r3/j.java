package r3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f13681a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f13682b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f13683c;

    static {
        j jVar = new j("Ltr", 0);
        f13681a = jVar;
        j jVar2 = new j("Rtl", 1);
        f13682b = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f13683c = jVarArr;
        u0.c.j(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f13683c.clone();
    }
}
