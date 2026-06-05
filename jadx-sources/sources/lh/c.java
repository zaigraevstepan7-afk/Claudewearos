package lh;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f10978b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f10977a = i10;
        this.f10978b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f10977a) {
            case 0:
                d dVar = this.f10978b;
                synchronized (dVar) {
                    try {
                        yh.c cVar = (yh.c) dVar.f10979a.get();
                        ArrayList arrayListP = cVar.p();
                        cVar.l();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListP.size(); i10++) {
                            a aVar = (a) arrayListP.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f10973a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f10974b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            default:
                d dVar2 = this.f10978b;
                synchronized (dVar2) {
                    ((yh.c) dVar2.f10979a.get()).C(System.currentTimeMillis(), ((yh.b) dVar2.f10981c.get()).a());
                }
                return null;
        }
    }
}
