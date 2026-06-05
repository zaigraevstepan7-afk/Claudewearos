package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f16720a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f16721b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f16722c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f16723d;

    static {
        j jVar = new j("NO_OP", 0);
        f16720a = jVar;
        j jVar2 = new j("ADD", 1);
        f16721b = jVar2;
        j jVar3 = new j("REMOVE", 2);
        f16722c = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f16723d = jVarArr;
        u0.c.j(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f16723d.clone();
    }
}
