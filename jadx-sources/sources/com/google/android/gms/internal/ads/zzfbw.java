package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfbw {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfbv zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfbw(JsonReader jsonReader) throws JSONException, IOException {
        List listV = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        zzfbv zzfbvVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listV = hj.a.V(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                zzbct zzbctVar = zzbdc.zziz;
                String str = strNextString3;
                t tVar = t.f12227d;
                JSONObject jSONObject3 = jSONObject2;
                zzbda zzbdaVar = tVar.f12230c;
                zzbda zzbdaVar2 = tVar.f12230c;
                if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfbvVar = new zzfbv(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) zzbdaVar2.zzb(zzbdc.zzkG)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzgT)).booleanValue()) {
                            try {
                                Bundle bundleT = hj.a.T(hj.a.Y(jsonReader));
                                if (bundleT != null) {
                                    bundle = bundleT;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjz)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(strNextName)) {
                        zzbct zzbctVar2 = zzbdc.zzjA;
                        if (((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = hj.a.Y(jsonReader);
                        } else {
                            if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjH)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = hj.a.Y(jsonReader);
                                strNextString3 = str;
                            } else if (((Boolean) zzbdaVar2.zzb(zzbdc.zzcp)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                try {
                                    Bundle bundleT2 = hj.a.T(hj.a.Y(jsonReader));
                                    if (bundleT2 != null) {
                                        jZza2 = zza(bundleT2.getDouble("start_time"));
                                        jZza = zza(bundleT2.getDouble("end_time"));
                                    }
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            strNextString3 = str;
                            jSONObject2 = jSONObject3;
                        }
                    } else if (((Boolean) zzbdaVar2.zzb(zzbdc.zzjz)).booleanValue()) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    strNextString3 = str;
                    jSONObject2 = jSONObject3;
                }
                strNextString3 = str;
                jSONObject2 = jSONObject3;
            }
        }
        JSONObject jSONObject4 = jSONObject2;
        String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listV;
        this.zzc = iNextInt;
        if (((Boolean) zzbfi.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbem zzbemVar = zzbeq.zza;
            if (((Long) zzbemVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbemVar.zze()).intValue();
            } else {
                this.zzd = iNextInt3;
            }
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzfbvVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject4;
        this.zzq = str2;
        zzbem zzbemVar2 = zzbfg.zza;
        this.zzr = ((Long) zzbemVar2.zze()).longValue() > 0 ? ((Long) zzbemVar2.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }
}
