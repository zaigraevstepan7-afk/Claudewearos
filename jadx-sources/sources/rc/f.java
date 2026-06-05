package rc;

import android.util.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public String f14339a;

    @Override // rc.g
    public void f(JsonWriter jsonWriter) throws IOException {
        Object obj = h.f14340b;
        jsonWriter.name("params").beginObject();
        String str = this.f14339a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
